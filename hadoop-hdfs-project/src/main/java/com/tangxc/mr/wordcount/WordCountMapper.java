package com.tangxc.mr.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 10:10 2019/3/19
 * @Modified by
 */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    private Text mapOutputKey = new Text();
    private IntWritable mapOutputValue = new IntWritable(1);

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] words = value.toString().split(" ");
        for (String word : words) {
            mapOutputKey.set(word);
            context.write(mapOutputKey, mapOutputValue);
        }
    }

}

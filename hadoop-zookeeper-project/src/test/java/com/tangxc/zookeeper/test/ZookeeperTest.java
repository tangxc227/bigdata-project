package com.tangxc.zookeeper.test;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Test;

import java.util.List;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 16:14 2019/3/13
 * @Modified by
 */
public class ZookeeperTest {

    @Test
    public void testLs() throws Exception {
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 5000, null);
        List<String> list = zooKeeper.getChildren("/kafka/brokers/topics/test2/partitions/0", null);
        list.forEach(str -> System.out.println(str));
    }

    @Test
    public void testLsAll() throws Exception {
        ls("/");
    }

    public void ls(String path) throws Exception {
        System.out.println(path);
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 5000, null);
        while (!zooKeeper.getState().isConnected()) {
            Thread.sleep(10);
        }
        List<String> list = zooKeeper.getChildren(path, null);
        if (null == list || list.isEmpty()) {
            return;
        }
        for (String childPath : list) {
            if ("/".equals(path)) {
                ls(path + childPath);
            } else {
                ls(path + "/" + childPath);
            }
        }
    }

    /**
     * 设置数据
     *
     * @throws Exception
     */
    @Test
    public void setData() throws Exception {
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 5000, null);
        zooKeeper.setData("/a", "tomaslee".getBytes(), 0);
    }

    /**
     * 创建临时节点
     *
     * @throws Exception
     */
    @Test
    public void createEmphoral() throws Exception {
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 5000, null);
        zooKeeper.create("/c/c1", "toms".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        Thread.sleep(10000);
        System.out.println("hello");
        zooKeeper.close();
    }

    @Test
    public void testWatch() throws Exception {
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 5000, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("连接ZK...");
            }
        });

        Stat stat = new Stat();

        Watcher watcher = new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("数据修改了");
                try {
                    byte[] data = zooKeeper.getData("/a", this, null);
                    System.out.println("当前数据：" + new String(data));
                } catch (Exception e) {
                }
            }
        };

        byte[] data = zooKeeper.getData("/a", watcher, stat);
        System.out.println(new String(data));

        while (true) {
            Thread.sleep(1000);
        }
    }

}

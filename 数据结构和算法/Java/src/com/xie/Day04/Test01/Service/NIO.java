package com.xie.Day04.Test01.Service;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * NIO原理
 * 就是使用了channel技术  这是一种基于缓存的技术！
 * 强化就是加上内核函数select / epoll一起使用！
 *
 * 通道Channel：由java.nio.channels包定义。Channel表示IO源与目标打开的连接。Channel类似于传统的"流"，只不过Channel本身不能直接访问数据，Channel只能与Buffer进行交互。
 *
 * 传统的数据流：
 * CPU处理IO，性能损耗太大
 * 改为：
 * 内存和IO接口之间加了 DMA(直接存储器)，DMA向CPU申请权限，IO的操作全部由DMA管理。CPU不要干预。
 * 若有大量的IO请求，会造成DMA的走线过多，则也会影响性能。
 *
 * 则改DMA为Channel，Channel为完全独立的单元，不需要向CPU申请权限，专门用于IO。
 */
public class NIO {

   protected static volatile List<SocketChannel> socketChannels=new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel=ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress("127.0.0.1",8888));
        serverSocketChannel.configureBlocking(false);
        CLass_ServiceChanle cLass_serviceChanle=new CLass_ServiceChanle(socketChannels);
        Thread thread=new Thread(cLass_serviceChanle);
        thread.start();
        while (true){
            SocketChannel socketChannel= serverSocketChannel.accept();
            if(socketChannel!=null){
                System.out.println("连接...");
                socketChannel.configureBlocking(false);
                socketChannels.add(socketChannel);
            }

        }
    }
}


class CLass_ServiceChanle implements Runnable{
    public  List<SocketChannel> socketChannels;

    public ByteBuffer buffer;

    public  CLass_ServiceChanle(List<SocketChannel> socketChannels){
        this.socketChannels=socketChannels;
        buffer=ByteBuffer.allocate(1024);
    }


    //做接受处理
    @Override
    public void run() {
        while (true){
            for (SocketChannel socketChannel: socketChannels
                 ) {

                try {
                    socketChannel.read(buffer);
                    if(buffer.position()!=0){
                        buffer.flip();
                        System.out.println(new String(buffer.array()));
                        buffer.flip();

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
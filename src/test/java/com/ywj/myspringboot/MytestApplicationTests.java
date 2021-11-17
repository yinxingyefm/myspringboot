package com.ywj.myspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Thread.sleep;

@SpringBootTest
class MytestApplicationTests {
/**统计数组中各个数字的个数**/
    @Test
    void numberCount() {
        Integer index[]={1,1,2,2,3,3,3};
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer i = 0; i <index.length ; i++) {
           Integer  j=0;
            if(map.get(index[i])==null){
                j=0;
            }else {
               j = map.get(index[i]);
            }
            j++;
            map.put(index[i],j);
        }
        for (Integer i:map.keySet()
             ) {
            System.out.println(i+"有:"+map.get(i)+"个");
        }
    }
    /**九九乘法表**/
    @Test
    void chengfabiao(){
        for(int i = 1;i<10;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    /**
     * 编写TimeThread，负责计时，并打出当前的时间,输出小时分钟秒钟，
     时间格式要求为： 12:35:28。并做测试。
     *
     * 程序分析：
     * 1.计时功能要使用线程来实现
     * 2.显示时间的格式用SimpleDateFormat类
     * */
    @Test
   void  TimeThread() throws InterruptedException {

        SimpleDateFormat s=new SimpleDateFormat("HH:mm:ss");
        while (true){
            String format = s.format(new Date());
            System.out.println(format);
            sleep(1000);
        }
    }
    /**冒泡排序**/
    @Test
    void MaoPao(){
        int a[] = { 2, 3, 6, 4, 0, 1, 7, 8, 5, 9 };
        int length = a.length;
        int temp = 0;
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
      for (int i=0;i<a.length;i++)
      {
          System.out.println(a[i]);
      }

    }
    /**统计D:\test\src 下test.txt文件中出现字母的个数**/
    @Test()
    void FileReader() throws IOException {
        File file = new File("D:\\test\\src\\text.txt");
        //定义字符读取(缓冲)流
        BufferedReader bfd=new BufferedReader(new FileReader(file));
        //定义字符串接受读取的文件流
        String value=null;
        List<String> list=new ArrayList<>();
        while ((value=bfd.readLine())!=null){
            list.add(value);
        }
        System.out.println("list:"+list.toString());
        Map<String ,Integer> map=new HashMap<>();
        for (Integer i = 0; i <list.size(); i++) {
            Integer  j=0;
            if(map.get(list.get(i))==null){
                j=0;
            }else {
                j = map.get(list.get(i));
            }
            j++;
            map.put(list.get(i),j);
        }
        for (String s:map.keySet()
        ) {
            System.out.println(s+"有:"+map.get(s)+"个");
        }

    }

}

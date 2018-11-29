/*
 * @Project Name: KiplingRoad
 * @File Name: SimpleTest
 * @Package Name: com.kip.pattern.factory.simple
 * @Date: 2018/11/24 23:59
 * @Creator: chenqiuping-516
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.simple;

import factory.Car;
import factory.Honda;

/**
 * 简单工厂造车
 *
 * @author Kipling
 * @date 2018/11/24 23:59
 * @see
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        // 开闭原则  修改服务端
        // 造车这个过程比较麻烦，用户不需要自己造
        Car car = new Honda();
        System.out.println(car.getBrand());
        //小作坊式的生产模式
        //用户本身不再关心制造的过程，而只需要关心这个结果
        //BMW,Honda,BYD 制造过程是不一样的

        // 通过简单的造车厂造车 我只要告诉工厂我要什么车，不需关心制造制造
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getBrand("BMW").getBrand());
    }
}

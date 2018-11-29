/*
 * @Project Name: design_pattern
 * @File Name: FactoryTest
 * @Package Name: factory.func
 * @Date: 2018/11/25 0:38
 * @Creator: Kipling
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.func;

import factory.BYD;

/**
 * 工厂模式
 *
 * @author Kipling
 * @date 2018/11/25 0:38
 * @see
 */
public class FactoryTest {
    public static void main(String[] args) {
        //找到相对应的工厂去造车
        // 需要知道什么工厂造什么车  可能会搞错
        CarFactory bmwFactory = new BMWFactory();
        CarFactory bydFactory = new BYDFactory();
        CarFactory hondaFactory = new HondaFactory();
        System.out.println(bmwFactory.productCar().getBrand());
        System.out.println(bydFactory.productCar().getBrand());
        System.out.println(hondaFactory.productCar().getBrand());
    }
}

/*
 * @Project Name: design_pattern
 * @File Name: BMWFactory
 * @Package Name: factory.func
 * @Date: 2018/11/25 0:27
 * @Creator: chenqiuping-516
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.func;

import factory.BMW;
import factory.Car;

/**
 * 宝马车工厂
 *
 * @author Kipling
 * @date 2018/11/25 0:27
 * @see
 */
public class BMWFactory implements CarFactory{
    @Override
    public Car productCar() {
       return new BMW();
    }
}

/*
 * @Project Name: design_pattern
 * @File Name: BYDFactory
 * @Package Name: factory.func
 * @Date: 2018/11/25 8:36
 * @Creator: Kipling
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.func;

import factory.BYD;
import factory.Car;

/**
 * TODO
 *
 * @author Kipling
 * @date 2018/11/25 8:36
 * @see
 */
public class BYDFactory implements CarFactory {
    @Override
    public Car productCar() {
        return new BYD();
    }
}

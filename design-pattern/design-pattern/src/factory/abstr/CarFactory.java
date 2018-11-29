/*
 * @Project Name: design_pattern
 * @File Name: CarFactory
 * @Package Name: factory.abstr
 * @Date: 2018/11/25 1:01
 * @Creator: Kipling
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.abstr;

import factory.BMW;
import factory.BYD;
import factory.Car;
import factory.Honda;

/**
 * TODO
 *
 * @author Kipling
 * @date 2018/11/25 1:01
 * @see
 */
public class CarFactory extends AbstractCarFactory{
    @Override
    Car produceBMW() {
        return new BMW();
    }

    @Override
    Car produceHonda() {
        return new Honda();
    }

    @Override
    Car produceBYD() {
        return new BYD();
    }

}

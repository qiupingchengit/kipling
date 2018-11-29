/*
 * @Project Name: design_pattern
 * @File Name: CarFactory
 * @Package Name: factory.func
 * @Date: 2018/11/25 0:28
 * @Creator: chenqiuping-516
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.func;

import factory.Car;

/**
 * 车工厂
 *
 * @author Kipling
 * @date 2018/11/25 0:28
 * @see
 */
public interface CarFactory {
    /**
     * 生产车
     * @author Kipling
     * @date 2018/11/25 0:35
     * @since 1.0.0
     * @return
     */
    Car productCar();
}

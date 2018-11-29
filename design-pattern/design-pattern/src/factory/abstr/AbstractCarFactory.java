/*
 * @Project Name: design_pattern
 * @File Name: AbstractCarFactory
 * @Package Name: factory.abstr
 * @Date: 2018/11/25 0:56
 * @Creator: Kipling
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.abstr;

import factory.Car;

/**
 * 抽象工厂
 *
 * @author Kipling
 * @date 2018/11/25 0:56
 * @see
 */
public abstract class AbstractCarFactory {
    //公共的逻辑
    //方便于统一管理

    /**
     * 造宝马
     * @author Kipling
     * @date 2018/11/25 1:00
     * @since 1.0.0
     * @return
     */
    abstract Car produceBMW();

    /**
     * 造本田
     * @author Kipling
     * @date 2018/11/25 1:00
     * @since 1.0.0
     * @return
     */
    abstract Car produceHonda();

    /**
     * 造比亚迪
     * @author Kipling
     * @date 2018/11/25 1:00
     * @since 1.0.0
     * @return
     */
    abstract Car produceBYD();
}

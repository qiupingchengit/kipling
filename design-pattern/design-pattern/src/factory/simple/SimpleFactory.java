/*
 * @Project Name: KiplingRoad
 * @File Name: SimpleFactory
 * @Package Name: com.kip.pattern.factory.simple
 * @Date: 2018/11/25 0:00
 * @Creator: chenqiuping-516
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.simple;

import factory.BMW;
import factory.BYD;
import factory.Car;
import factory.Honda;

/**
 * 简单工厂
 *
 * @author chenqiuping-516
 * @date 2018/11/25 0:00
 * @see
 */
public class SimpleFactory {

    public Car getBrand(String brand){
        if("BMW".equals(brand)){
            return new BMW();
        }if("BYD".equals(brand)){
            return new BYD();
        }if("Honda".equals(brand)){
            return new Honda();
        }else{
            System.out.printf("不能生产你所需要的车");
            return null;
        }
    }
}

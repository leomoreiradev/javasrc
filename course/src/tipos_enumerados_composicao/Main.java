package tipos_enumerados_composicao;

import tipos_enumerados_composicao.entities.Order;
import tipos_enumerados_composicao.entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println("Pegando do sistema:"+ os1);

        System.out.println("Recebendo de fora   :" + os2);

    }
}

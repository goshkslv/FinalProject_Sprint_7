package OrderTests;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.ValidatableResponse;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.order.OrderAssertVoid;
import ru.yandex.order.OrderSteps;

public class TestGetOrdersList {
    private OrderSteps orderSteps;
    private OrderAssertVoid orderAssertVoid = new OrderAssertVoid();

    @Before
    public void setUp(){
        orderSteps = new OrderSteps();
    }

    @DisplayName("Проверка получения списка заказов")
    @Description("Тест на успешное получение списка заказов")
    @Test
    public void testGetOrdersList(){
        ValidatableResponse response = orderSteps.getOrdersList();
        orderAssertVoid.successGetOrdersList(response);
    }
}
package core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Maksym on 5/25/2017.
 */
@RestController
public class TradeController {

    @RequestMapping("/trades")
    public List<Trade> trades() {
        Trade trade = new Trade();
        trade.setId("1");
        trade.setBuyOrSell("BUY");
        trade.setQuantity("100");
        trade.setSecurity("IBM.N");
        trade.setPrice("152");

        return Arrays.asList(trade);
    }
}
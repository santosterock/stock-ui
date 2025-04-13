package com.sujesh.stock_ui;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class StockService {

    public Map<String, Object> getStockPrice(String symbol) {
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=" + symbol + "&interval=5min&apikey=YOUR_API_KEY";
        return new RestTemplate().getForObject(url, Map.class);
    }
}

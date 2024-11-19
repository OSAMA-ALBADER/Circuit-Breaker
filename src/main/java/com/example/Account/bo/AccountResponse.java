package com.example.Account.bo;

import java.util.List;

public class AccountResponse {

    private List<Stock> stock;

    private String status;

    public AccountResponse() {}

    public AccountResponse(List<Stock> stocklist, String status) {
        stock = stocklist;
    }

    public List<Stock> getStock() {
        return stock;
    }

    public void setStock(List<Stock> stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

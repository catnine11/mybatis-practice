package com.management.product.model.dto;

public class ProductDTO {

    private String product_code;
    private String product_name;
    private String origin_cost;
    private String release_date;
    private String discount_rate;
    private String sales_quantity;
    private String stock_quantity;
    private String category_code;
    private String production_status;

    public ProductDTO() {}

    public ProductDTO(String product_code, String product_name, String origin_cost, String release_date, String discount_rate, String sales_quantity, String stock_quantity, String category_code, String production_status) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.origin_cost = origin_cost;
        this.release_date = release_date;
        this.discount_rate = discount_rate;
        this.sales_quantity = sales_quantity;
        this.stock_quantity = stock_quantity;
        this.category_code = category_code;
        this.production_status = production_status;
    }

    public String getproduct_code() {
        return product_code;
    }

    public void setproduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getproduct_name() {
        return product_name;
    }

    public void setproduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getorigin_cost() {
        return origin_cost;
    }

    public void setorigin_cost(String origin_cost) {
        this.origin_cost = origin_cost;
    }

    public String getrelease_date() {
        return release_date;
    }

    public void setrelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getdiscount_rate() {
        return discount_rate;
    }

    public void setdiscount_rate(String discount_rate) {
        this.discount_rate = discount_rate;
    }

    public String getsales_quantity() {
        return sales_quantity;
    }

    public void setsales_quantity(String sales_quantity) {
        this.sales_quantity = sales_quantity;
    }

    public String getstock_quantity() {
        return stock_quantity;
    }

    public void setstock_quantity(String stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public String getcategory_code() {
        return category_code;
    }

    public void setcategory_code(String category_code) {
        this.category_code = category_code;
    }

    public String getproduction_status() {
        return production_status;
    }

    public void setproduction_status(String production_status) {
        this.production_status = production_status;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "product_code='" + product_code + '\'' +
                ", product_name='" + product_name + '\'' +
                ", origin_cost='" + origin_cost + '\'' +
                ", release_date='" + release_date + '\'' +
                ", discount_rate='" + discount_rate + '\'' +
                ", sales_quantity='" + sales_quantity + '\'' +
                ", stock_quantity='" + stock_quantity + '\'' +
                ", category_code='" + category_code + '\'' +
                ", production_status='" + production_status + '\'' +
                '}';
    }
}

package oop1;

public class ProductMain {
    public static void main(String[] args) {


        Product product1 = new Product();
        product1.setName("Smeg Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(20);
        product1.setImageUrl("url.jpg");


        Product product2 = new Product();
        product2.setName("Delonghi Kahve Makinesi");
        product2.setUnitPrice(8000);
        product2.setDiscount(5);
        product2.setUnitsInStock(25);
        product2.setImageUrl("url2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4000);
        product3.setDiscount(0);
        product3.setUnitsInStock(42);
        product3.setImageUrl("url3.jpg");

        Product[] products = {product1,product2,product3};

        for (Product product : products){

            System.out.println(product.getName());
            System.out.println(product.getUnitPrice());
            System.out.println(product.getUnitsInStock());
            System.out.println(product.getDiscount());
            System.out.println(product.getImageUrl());
            System.out.println("------------------");

        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("05226522");
        individualCustomer.setCustomerNumber("1253454");
        individualCustomer.setFirstName("Ali");
        individualCustomer.setLastName("Büyük");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhoneNumber("0533333333");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}

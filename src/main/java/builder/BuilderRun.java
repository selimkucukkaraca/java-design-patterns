package builder;

public class BuilderRun {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(12L);
        product1.setDescription("description");
        product1.setName("name");

        Product product2 = new Product.ProductBuilder()
                .id(12L)
                .name("name")
                .description("description")
                .build();

        ProductLombok lombokInstance = ProductLombok.builder()
                .id(12L)
                .name("name")
                .description("description")
                .build();

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(lombokInstance);
    }
}
package fr.carrefourkata.controller;

import fr.carrefourkata.dto.ProductDto;
import fr.carrefourkata.process.ProductProcess;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/carrefour")
public class ProductControllerImpl implements ProductController {

    private final ProductProcess productProcess;

    private KafkaTemplate<Integer, String> kafkaTemplate;

    @Value("${topic.name.producer}")
    private String topic;


    public ProductControllerImpl(ProductProcess productProcess, KafkaTemplate<Integer, String> kafkaTemplate) {
        this.productProcess = productProcess;
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/products")
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        return ResponseEntity.ok().body(productProcess.getAllProducts());
    }


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/product")
    @Override
    public ResponseEntity<Void> creatProduct(@RequestBody ProductDto productDto) {
        productProcess.addProduct(productDto);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/products/product/{productId}")
    public ResponseEntity<ProductDto> getProduct(int productId) {
        return ResponseEntity.ok().body(productProcess.getProduct(productId));
    }

    @Override
    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/products/delete/{productId}")
    public ResponseEntity<Void> deleteProduct(int productId) {
        productProcess.deleteProduct(productId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @Override
    @PatchMapping(consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE,
            path = "/products/uptade/{productId}")
    public ResponseEntity<Void> updateProduct(int productId, ProductDto productDto) {
        productProcess.updateProduct(productId, productDto);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/product/publish/{message}")
    public ResponseEntity<String> publishMessage(String messageProduit) {
        // ajouter un service qui envoie un message avec les valeur demander
       // kafkaTemplate.send(topic, message);
        return null;
    }


}

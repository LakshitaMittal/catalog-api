# catalog-api
Spring Boot Product Catalog API

# Product Catalog API

## Setup Instructions

1. Clone the repository.
2. Set up MongoDB (locally or using MongoDB Atlas).
3. Update `application.properties` with your MongoDB connection details.
4. Run the application using your IDE or `mvn spring-boot:run`.

## API Endpoints

- **POST** `/api/products` - Create a new product.
- **GET** `/api/products/{productId}` - Get a product by ID.
- **GET** `/api/products` - Get all products.
- **PUT** `/api/products/{productId}` - Update a product.
- **DELETE** `/api/products/{productId}` - Delete a product.
- **GET** `/api/products/search` - Search products by category.

## Example Responses

**Add Product**:
```json
{
  "name": "Sample Product",
  "description": "This is a sample product",
  "price": 29.99,
  "categories": ["Electronics", "Home"],
  "attributes": [
    {"color": "red"},
    {"size": "medium"}
  ],
  "stockStatus": {
    "inStock": true,
    "quantity": 100
  },
  "reviews": [
    {
      "userId": "user123",
      "rating": 5,
      "comment": "Great product!"
    }
  ]
}


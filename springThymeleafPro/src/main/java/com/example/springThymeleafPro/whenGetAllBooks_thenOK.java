package com.example.springThymeleafPro;

import org.springframework.http.HttpStatus;

@Test
public class whenGetAllBooks_thenOK(){
	Response response = RestAssured.get(API_ROOT);
	  
    assertEquals(HttpStatus.OK.value(), response.getStatusCode());

}
@Test
public void whenGetBooksByTitle_thenOK() {
    Book book = createRandomBook();
    createBookAsUri(book);
    Response response = RestAssured.get(
      API_ROOT + "/title/" + book.getTitle());
     
    assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    assertTrue(response.as(List.class)
      .size() > 0);
}
@Test
public void whenGetCreatedBookById_thenOK() {
    Book book = createRandomBook();
    String location = createBookAsUri(book);
    Response response = RestAssured.get(location);
     
    assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    assertEquals(book.getTitle(), response.jsonPath()
      .get("title"));
}
 
@Test
public void whenGetNotExistBookById_thenNotFound() {
    Response response = RestAssured.get(API_ROOT + "/" + randomNumeric(4));
     
    assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatusCode());
}

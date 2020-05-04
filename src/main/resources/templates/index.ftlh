<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Lesson 65 homeWork</title>
    </head>
    <body>
        <h1>Содержимое страницы</h1>

        <ul>
        <#list products as pdt>
            <li>
                <p>
                    ${pdt.id} - ${pdt.name} - ${pdt.description}-${pdt.price}-${pdt.quantity}-<a href="/delete/${pdt.id}">delete</a>
                </p>
            </li>
        </#list>
        </ul>

      <form action="/index" method="post">
          <label>Name</label>
          <input type="text" name="name" id="name" required="required" placeholder="product name"><br>

          <label>Description</label>
          <input type="text" name="description" required="required" id="description" placeholder="product description"><br>

          <label>Price</label>
          <input type="number" name="price" required="required"  id="price" placeholder="product price"><br>

          <label>Quantity</label>
          <input type="number" name="quantity" required="required"  id="quantity" placeholder="product quantity"><br>
          <input type="submit" value="add Product">
      </form>
    </body>
</html>

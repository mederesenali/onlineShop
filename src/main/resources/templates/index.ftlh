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
                <p>${pdt.id} - ${pdt.name} - ${pdt.description}-${pdt.price}-${pdt.quantity}</p>
            </li>
        </#list>
        </ul>


    </body>
</html>

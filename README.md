# Фреймворк Spring (семинары)
## Урок 3. Использование Spring для разработки серверного приложения

Задание: Используя Spring, создайте серверное приложение, которое обрабатывает HTTP-запросы и возвращает JSON-ответы.

Это Spring Boot приложение, созданное для управления продуктами. Оно предоставляет API для добавления и получения продуктов.

Приложение запустится на порту 8080 (если не указано иное в настройках), и вы сможете получить доступ к нему, перейдя по адресу http://localhost:8080/product в браузере.

## API
`POST` /product: Добавляет новый продукт. Тело запроса должно содержать JSON-объект с полями name и price.

`GET` /product: Возвращает список всех продуктов.

## Структура
Проект содержит следующие основные классы:

`ProductManagementAppApplication`: Это основной класс приложения, который запускает Spring Boot приложение.

`Product`: Это класс модели, который представляет продукт.

`ProductController`: Это контроллер, который обрабатывает HTTP-запросы к API.

`ProductService`: Это сервис, который обрабатывает бизнес-логику приложения.

## Результаты
![img](https://github.com/ShumAhd/Spring-framework-3/blob/main/img/2024-01-23_232519.jpg)
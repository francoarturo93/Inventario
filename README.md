# Inventario - Gestión de Stock

Este es un proyecto de gestión de inventario y control de stock que permite manejar productos, categorías, entradas y salidas en un sistema de inventario. El proyecto está desarrollado utilizando **Spring Boot** en el backend y **Angular** en el frontend.

## Tecnologías Utilizadas

### Backend
- **Java 17**
- **Spring Boot 3.2.10**
  - `spring-boot-starter-data-jpa` - Para persistencia de datos usando JPA.
  - `spring-boot-starter-validation` - Validación de datos.
  - `spring-boot-starter-web` - Para crear servicios REST.
  - `spring-boot-devtools` - Herramientas de desarrollo.
- **MapStruct 1.5.2.Final** - Para mapear entidades y DTOs.
- **MySQL** - Base de datos relacional.
- **Lombok** - Para reducir el código repetitivo (Getters, Setters, etc.).
- **Maven** - Para la gestión de dependencias y ciclo de vida del proyecto.
  
### Frontend
- **Angular 16.2.16**
  - Uso de componentes SPA para gestionar productos y controlar el stock.
  - Estilos en **SCSS**.
  - Consumo de servicios REST usando `HttpClient`.

## Instalación y Ejecución

### Requisitos previos
- **Java 17** o superior.
- **Node.js** (versión 16.20.2 o superior) y **npm** (versión 8.19.4 o superior).
- **MySQL** instalado y configurado.

### Configuración del Backend

1. Clona el repositorio:
    ```bash
    git clone https://github.com/francoarturo93/Inventario.git
    ```

2. Configura las propiedades de la base de datos en `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/tu_DB
    spring.datasource.username=root
    spring.datasource.password=tucontraseña
    ```

3. Compila y ejecuta la aplicación backend:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

4. La API estará disponible en `http://localhost:8080/api/inventario`.

### Configuración del Frontend

1. Navega al directorio del frontend:
    ```bash
    cd frontend
    ```

2. Instala las dependencias de npm:
    ```bash
    npm install
    ```

3. Inicia el servidor de desarrollo:
    ```bash
    ng serve
    ```

4. La aplicación estará disponible en `http://localhost:4200`.

## Funcionalidades

### Backend (Spring Boot)
- **CRUD de Productos y Categorías**: Crear, listar y paginar productos y categorías.
- **Gestión de Stock**: Registrar entradas y salidas de productos, controlar el stock disponible.
- **Búsqueda por Fecha**: Buscar entradas y salidas de productos entre un rango de fechas.

### Frontend (Angular)
- **Formulario de Creación de Productos**: Crear productos con nombre, precio, entradas y categoría.
- **Control de Entradas y Salidas**: Registrar entradas y salidas de productos con la correspondiente actualización de stock.
- **Listado de Productos y Categorías**: Listar productos y categorías con paginación.

## Endpoints API

La API REST expone varios endpoints para la gestión de productos, categorías y stock. A continuación, se listan brevemente:

### Productos
- **GET /api/inventario/pageproductos**  
  Retorna una página de productos.
  - Parámetros: `page` (número de página), `size` (tamaño de la página)

- **POST /api/inventario/crearproductos**  
  Crea un nuevo producto.
  - Body: Objeto JSON de tipo `ProductoDTO`
  
### Categorías
- **GET /api/inventario/pagecategorias**  
  Retorna una página de categorías.
  - Parámetros: `page` (número de página), `size` (tamaño de la página)
  
- **GET /api/inventario/listcategorias**  
  Lista todas las categorías disponibles.

### Control de Stock
- **POST /api/inventario/entradas**  
  Agrega entradas a un producto específico (incrementa el stock).
  - Body: Objeto JSON de tipo `ProductoEntradaDTO`

- **POST /api/inventario/salidas**  
  Registra salidas de un producto específico (decrementa el stock).
  - Body: Objeto JSON de tipo `ProductoSalidaDTO`

### Reportes por Fecha
- **GET /api/inventario/buscarEntradasPorFecha**  
  Busca entradas de productos por un rango de fechas.
  - Parámetros: `fecha` (en formato `dd-MM-yy`)

- **GET /api/inventario/buscarSalidasPorFecha**  
  Busca salidas de productos por un rango de fechas.
  - Parámetros: `fecha` (en formato `dd-MM-yy`)



## Contribuciones
Las contribuciones son bienvenidas. Si deseas contribuir a este proyecto, por favor, haz un fork del repositorio y envía tus pull requests.


# Tema 7 — Coches 🚗

Ejercicio de Java para trabajar con **JSON**, **XML** y **DOM** usando Gson y la API estándar de Java.

---

## 📋 Descripción

A partir de un fichero `coches.json`, el alumno debe:

1. Leer el JSON y construir una lista de objetos `Coche`
2. Mostrar la lista por consola
3. Convertir la lista a un documento XML usando `DocumentBuilder`
4. Mostrar el XML por consola
5. Guardar el XML en `src/main/resorces/cochesOut.xml`

---

## 🗂️ Estructura del proyecto

```
tema7coches/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/tema7coches/
│   │   │   ├── main/
│   │   │   │   └── CocheTest.java       ← clase principal (TODO aquí)
│   │   │   ├── model/
│   │   │   │   └── Coche.java           ← modelo (TODO aquí)
│   │   │   └── util/
│   │   │       └── Utilidades.java      ← NO modificar
│   │   └── resorces/
│   │       └── coches.json              ← datos de entrada
```

---

## ✅ Tareas que debe implementar el alumno

### 1. `Coche.java`

Completar la clase con:

- Constructor vacío
- Constructor con parámetros (`marca`, `modelo`, `matricula`)
- Getters y setters para cada campo
- Método `toString()`

### 2. `CocheTest.java` — método `fromCochesToXML`

Implementar el método que convierte una `List<Coche>` en un `Document` XML con esta estructura:

```xml
<coches>
    <coche>
        <marca>Toyota</marca>
        <modelo>Corolla</modelo>
        <matricula>1234ABC</matricula>
    </coche>
    <coche>
        <marca>Seat</marca>
        <modelo>Ibiza</modelo>
        <matricula>5678DEF</matricula>
    </coche>
</coches>
```

Pasos sugeridos dentro del método:
1. Crear `DocumentBuilderFactory` → `DocumentBuilder` → `Document`
2. Crear el elemento raíz `<coches>` y añadirlo al `Document`
3. Recorrer la lista y crear un `<coche>` con sus subelementos por cada objeto
4. Devolver el `Document`

---

## 🚀 Cómo empezar

### Requisitos previos

- Java 17 o superior
- Maven 3.x
- Eclipse con Git Bash integrado
- Cuenta de GitHub

### Paso 1 — Crear tu repositorio desde la plantilla

1. Entra en la página del repositorio plantilla en GitHub
2. Pulsa el botón verde **Use this template** → **Create a new repository**

   ![Use this template](https://docs.github.com/assets/cb-76823/mw-1440/images/help/repository/use-this-template-button.webp)

3. Ponle de nombre `tema7coches`
4. Márcalo como **privado** (Private)
5. Pulsa **Create repository**

Tu repositorio ya tiene todos los ficheros de la plantilla y está listo para trabajar.

### Paso 2 — Clonar tu repositorio en local

Abre **Git Bash** en Eclipse (`Window` → `Show View` → `Terminal`) y navega a tu workspace:

```bash
cd /c/Users/TuNombre/eclipse-workspace
```

Clona **tu** repositorio (no el del profesor):

```bash
git clone https://github.com/TU_USUARIO/tema7coches.git
cd tema7coches
```

Si GitHub te pide credenciales, usa tu usuario y tu **token de acceso personal** como contraseña (no tu contraseña de GitHub).

### Paso 3 — Importar el proyecto en Eclipse

1. `File` → `Import`
2. `Maven` → `Existing Maven Projects` → `Next`
3. En **Root Directory** pulsa `Browse` y selecciona la carpeta `tema7coches`
4. Eclipse detecta el `pom.xml` automáticamente — marca el checkbox
5. `Finish`

Espera a que Maven descargue las dependencias (barra de progreso abajo).

### Paso 4 — Implementar los TODOs

Abre las clases indicadas en la sección **Tareas** y completa el código.

---

## 💾 Guardar y entregar tu trabajo

Cada vez que quieras guardar tu progreso en GitHub:

```bash
git add .
git commit -m "Descripción de lo que has implementado"
git push origin master
```

> ⚠️ **Importante:** asegúrate de hacer al menos un `push` **antes de la fecha límite de entrega** indicada por el profesor. Se comprobará la fecha y hora del último commit.

---

## 📦 Dependencias (ya configuradas en `pom.xml`)

| Librería | Versión | Para qué |
|----------|---------|----------|
| Gson | 2.10.1 | Leer el fichero JSON |
| JUnit Jupiter | 5.10.2 | Ejecución de tests automáticos |

---

## 🔧 Ejecutar los tests manualmente

```bash
mvn test
```

Verás el resultado de cada test en la consola. El objetivo es que todos aparezcan en verde (`BUILD SUCCESS`).

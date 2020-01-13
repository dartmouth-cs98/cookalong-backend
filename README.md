# Cookalong Backend

CookAlong is an augmented reality application to help streamline the cooking process, including selecting recipes, step-by-step instructions, and education on techniques, processes, and ingredients.

## Architecture
This REST API is built with Java Spring Boot, deployed with Heroku. The communication with JSON objects is facilitated with [Jackson](https://www.baeldung.com/jackson). The current version stores objects in a MongoDB database, running locally.

## Endpoints
The API root url is <https://cookalong-api.herokuapp.com>

### All Recipes (/recipes)
Returns all recipes in the database

### Recipe by ID (/recipes/{recipeId})
Returns from the recipe database whichever recipe matches the id passed. Returns null if not found. 

### Add Recipe (/recipes/add)
Adds a recipe to the database. The request body must match the structure of the Recipe object.

## Build
To build locally, download the repo and run mvn build. Then mvn run will deploy the API to <http://localhost:5000/>
Make sure that mongo is running locally on your machine to have the MongoDB backend connection. Create a db that matches the db name in application.properties.

## Deployment
Deployment is to Heroku, which is added as a remote.

## Authors
Danielle Fang, Zack Johnson, Anders Limstrom, Erika Ogino, Brian Tomasco

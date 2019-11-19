# Cookalong Backend

CookAlong is an augmented reality application to help streamline the cooking process, including slecting recipes, step-by-step instructions, and education on techniques, processes, and ingredients.

## Architecture
This REST API is built with Java Spring Boot, deployed with Heroku. The communication with JSON objects is facilitated with [Jackson](https://www.baeldung.com/jackson). Currently, objects are served statically, so there is no storage or database, but it will be built in AWS.

## Endpoints
The API root url is <https://cookalong-api.herokuapp.com>

### Recipe (/recipe)
Returns one recipe. Currently has default value of grilled cheese name, with little additional information added. ID increments with each call. 

### Grilled Cheese (/grilledcheese)
Returns a grilled cheese recipe, with all steps, tools, and ingredients added to the object. 

### Pho (/pho)
Returns a pho recipe, similarly populated with all necessary fields.

## Build
To build locally, download the repo and run mvn build. Then mvn run will deploy the API to <http://localhost:5000/>

## Deployment
Deployment is to Heroku, which is added as a remote.

## Authors
Danielle Fang, Zack Johnson, Anders Limstrom, Erika Ogino, Brian Tomasco
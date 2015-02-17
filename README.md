# battlesnake-clojure

A simple [BattleSnake AI](http://battlesnake.io) written in Clojure with [Ring](https://github.com/ring-clojure/ring)

This is loosely based on Heroku's official [Getting Started with Clojure On Heroku](https://devcenter.heroku.com/articles/getting-started-with-clojure).

[![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)


### Running the AI locally

Fork and clone this repo:

```
git clone https://github.com/sendwithus/battlesnake-clojure.git
cd battlesnake-ruby
```

Install [Leiningen](http://leiningen.org/)

Run the server:

```
lein ring server-headless
```

Test the client in your browser: [http://localhost:3000](http://localhost:3000)


### Deploying to Heroku

Click the Deploy to Heroku button at the top or use the command line commands below.

Create a new Heroku app:

```
heroku apps:create APP_NAME
```

Push code to Heroku servers:

```
git push heroku master
```

Open Heroku app in browser:

```
heroku open
```

Or go directly via http://APP_NAME.herokuapp.com

View/stream server logs:

```
heroku logs --tail
```

from fastapi import FastAPI
from fastapi.params import Body

app = FastAPI() #app instance

@app.get("/") #Decorator that uses app instance 
def read_root():
    return {"Hello": "Welcome to my API"}


@app.get("/post") #/post is the directory visit server/post
def get_post():
    return {"data" : "The List of posts"}


@app.post("/create.post")
def create_post(payload: dict = Body(...)): #to get the input 
    print(payload) 
    return {"Message": f"title {payload['title']} content: {payload['content']}"}
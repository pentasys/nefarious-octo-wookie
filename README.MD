
#Frontend
1. Install node
2. install bower
3. init node: npm install (in the frontend folder)
4. init bower: bower install (in the frontend folder)

Gulp default task will start a server listening on port 8001.

#Backend
Start the backend with bootRun (gradle task)

#Deliver
Start the distribute task (gradle task) in the root project.

#Remarks
Be carefull when changing the static folder generated in the backends resources directory
as this directory is by naming convention needed to serve static content and files!

#Current Problems
Currently bower can not be installed on windows machines where git is not installed
globally. Therefore no dependencies will be copied to the output artifact.

#Node Versions
Node versions can be found here: [https://nodejs.org/en/download/releases/](https://nodejs.org/en/download/releases/)

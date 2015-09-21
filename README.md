# OpenSchool Project
It's an open web platform for schools. 

## Features
 - Organizing classes and students
 - Managing studies
 - Managing communication

## Goals

Although still not completely defined the goal would be to create an application to simple schools who could use this application for general task management. 
Imagine, for instance, developing countries, like African countries: In theirs elementary schools they could use a platform like this to store student information, managing classes and studies.

So this is the draft idea. Another main thing would be teaching Scala, MongoDB and Play Framework for developers. The data architecture is really basic, like an example from the first chapter of an OOP book, isn't it?

## Usage
The application uses Docker: https://www.docker.com/
 1. First you need to build a Docker image: `docker build -t znurgl/openschool` .
 2. Run the application: `docker run -i -t -p 8080:9000 -v {full-path-of-source}:/src znurgl/openschool`

## Issues
All project related tasks and bugs are under the 'issues' of this github page.

## Contribution
Any contribution is welcome. It's standard fork-and-pull-request method. The project is based on Play 2.4 framework with Scala and MongoDB. 

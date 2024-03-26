# Movie Genre Selection

This program simulates a movie genre selection system where users can choose a movie type and title to watch. It offers a variety of movie genres, including Adventure, Comedy, Science Fiction, and Horror.

## Overview

The program includes the following classes:

- `Main`: The main class where the movie selection process begins. It prompts users to enter the movie type and title and then creates the corresponding movie instance.

- `Movie`: The base class representing a generic movie. It provides a method to watch the movie and a factory method to create different movie types based on user input.

- `Adventure`, `Comedy`, `ScienceFiction`, `Horror`: Subclasses representing specific movie genres. Each subclass overrides the `watchMovie` method to provide genre-specific behavior.

- `NextMain`: An additional class demonstrating the usage of the movie selection system.

## Functionality

- Users can input the movie type (A for Adventure, C for Comedy, S for Science Fiction, H for Horror) and the movie title.
  
- Based on the user input, the program creates an instance of the corresponding movie genre and displays genre-specific information.
  
- Each movie genre has its own unique behavior when the movie is watched, providing an immersive experience for the viewer.

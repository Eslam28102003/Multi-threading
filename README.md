# Multi Threading Assignement 



## Project Structure

```
src
│
└───main
    └───java
        └───multithreading
            ├───imageProcessing
            │   ├───coordinators
            │   │   └───ThreadsCoordinator.java
            │   ├───helpers
            │   │   └───ColorHelper.java
            │   │   └───ImageLoadingHelper.java
            │   ├───services
            │   │   └───ImageRecolorService.java
            │   ├───workers
            │   │   └───ImageRecoloringWorker.java
            │   └───Main.java
            └───primesFinder
                ├───abstraction
                │   └───PrimesFindStrategy.java
                ├───coordinators
                │   └───ThreadsCoordinator.java
                ├───services
                │   └───PrimeNumberService.java
                ├───strategies
                │   └───SieveOfAtkinStrategy.java
                │   └───SieveOfEratosthenesStrategy.java
                │   └───TrivialPrimesFindStrategy.java
                ├───workers
                │   └───PrimeFindingWorker.java
                └───Main.java
         
```

---

# 🖼️ Multithreaded Image Recoloring Project

This Java project demonstrates how to apply multithreading techniques to recolor an image efficiently. The main goal is to utilize multiple threads to divide the processing workload and enhance performance when working with large images.

---

## 📌 Features

- Load and process images in Java.
- Apply recoloring logic using custom strategies.
- Divide the image using:
  - Horizontal slicing.
  - Block-based slicing (e.g., 400x400 px).
- Use native threads or thread pools (`ExecutorService`) for concurrency.
- Save the processed output as a new image.

---

## 🚀 Technologies Used

- Java SE
- Multithreading (Thread / Runnable)
- BufferedImage / ImageIO
- ExecutorService (optional)
- NetBeans (or any Java IDE)

---

---
![ChatGPT Image Apr 18, 2025, 01_05_15 AM](https://github.com/user-attachments/assets/94fba9bd-6620-4e84-ac1e-983b1b5601be)





# Prime Finder with Multithreading

## Overview

This project finds prime numbers within a specified range using multiple strategies and multithreading to speed up the process. The algorithms include:

- *Trivial Prime Checking*
- *Sieve of Eratosthenes*
- *Sieve of Atkin*

It divides the work into smaller tasks, with each task running in its own thread, making it faster for large ranges.

---

## Features

- Multiple algorithms for finding primes
- Multithreading for faster processing
- Easily extendable to add new prime-finding algorithms

---

## Structure

- *Main*: Starts the program and coordinates the process
- *ThreadsCoordinator*: Divides the range into smaller sub-ranges and assigns each to a separate worker thread
- *PrimeFindingWorker*: Each worker checks a sub-range for prime numbers
- *PrimeNumberService*: Uses different strategies to find prime numbers
- *PrimeFinding Strategies*: Includes the Trivial, Sieve of Eratosthenes, and Sieve of Atkin strategies

---

## How It Works

1. Main initializes the service and coordinator
2. The coordinator splits the range into smaller parts
3. Each part is processed by a worker in a separate thread
4. Results are collected and combined into a list of prime numbers

---




![ChatGPT Image Apr 18, 2025, 04_27_27 PM](https://github.com/user-attachments/assets/1e4722de-17f0-4999-b8fc-7d5cc528a9f2)




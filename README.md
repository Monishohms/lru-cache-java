# In-Memory LRU Cache System

## what is Cache Memory 
 
 Currently Demanded Localities are kep in a smaller and faster memory called as cache in order to reduce expensive main memory accesses.
 
#### Locality of reference: if CPU has requested an Address for memory Access then that particular Address or nearby Addresses will be Accessed soon.

## Working of Cache Memory

### 1. Cache Hit: when requested data of cpu is present in cache.
### 2. Cache Miss: when requested data of cpu is not present in cache.
### 3. Hit Ratio: Fraction of time cpu experience hit in cache.
               Hit ratio = No.of hit / total memory reference
               Miss ratio = 1 - Hit ratio
   
## What Happens During Cache Miss?

when CPU requested data is not present in cache then it is said to be cache miss, so the requested data is sent from main memory to cpu and along with it, the block (which contains missed data ) is copied from main memory to cache for future references. This reduces repeated expensive memory accesses.

---

# Block Replacement Policies

Since cache memory is limited, older data must be removed when capacity is exceeded.

### 1. FIFO (First-In-FirstOut)
### 2. Optimal
### 3. LRU (Least Recently Used)

## Why LRU is Commonly Used?

1. LRU replaces the block which have not been used for longest period of time.
2. LRU is commonly used because this policies gives:
   - High hit ratio
   - low cache miss penalty. 
   - efficiently utilize memory
   - optimize frequently accessed data retrieval
     
LRU-based caching is commonly used in:
- Browsers
- Databases
- Backend APIs
- Operating Systems
- Distributed Systems
   
hence, this Policies is implemented in real systems.

## Why HashMap and Doubly Linked List?

This project combines:
- HashMap
- Doubly Linked List

to achieve O(1) time complexity for both get and put operations.

### HashMap
Used for:
- constant-time lookup
- fast key-based access

### Doubly Linked List
Used for:
- maintaining access order
- efficiently moving recently accessed items
- removing least recently used items

Combining both data structures enables efficient cache management.

## Project Overview

This project implements an In-Memory LRU Cache System using Java.

The cache:
- stores data in memory
- tracks recently accessed items
- automatically evicts least recently used entries when capacity is exceeded

The implementation simulates real-world cache eviction behavior used in backend systems.

---

## Features

- O(1) get and put operations
- Automatic LRU eviction
- Efficient in-memory caching
- HashMap + Doubly Linked List implementation
- Edge case handling
- Ordered access tracking

---

## Tech Stack

- Java
- HashMap
- Doubly Linked List
- Object-Oriented Programming (OOP)

---

## Project Structure

```text
LRUCache.java
Main.java
```

---

## How to Run

1. Clone the repository

```bash
git clone https://github.com/Monishohms/lru-cache-java.git
```

2. Compile Java files

```bash
javac *.java
```

3. Run the project

```bash
java Main
```

---

## Future Improvements

- Generic Type Support
- Thread-Safe Cache
- TTL Expiration
- Persistent Storage Support
- REST API Integration
- Distributed Cache Support

## Sample Output

### Cache PUT Operations

<img width="901" height="762" alt="image" src="https://github.com/user-attachments/assets/bb2f59e8-43cf-4e9a-905b-e78212f0cd25" />

### Cache HIT and MISS

<img width="678" height="546" alt="image (1)" src="https://github.com/user-attachments/assets/6c0949ba-6731-49c7-b2c4-bc0a4dce1e9a" />

### LRU Eviction

<img width="752" height="396" alt="image (2)" src="https://github.com/user-attachments/assets/e15a172e-58f4-473f-a056-c73e053c44d0" />






 

 

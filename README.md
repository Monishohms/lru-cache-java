# In-Memory LRU Cache System

## what is Cache Memory 
 
 Currently Demanded Localities are kep in a smaller and faster memory called as cache in order to reduce expensive main memory accesses.
 
#### Locality of reference: if CPU has requested an Address for memory Access then that particular Address or nearby Addresses will be Accessed soon.

## Working of Cache Memory

### 1. Cache Hit: when demanded data of cpu is present in cache.
### 2. Cache Miss: when demanded data of cpu is not present in cache.
### 3. Hit Ratio: Fraction of time cpu experirences hit in cache.
               Hit ratio = No.of hit / total memory reference
               Miss ratio = 1 - Hit ratio
   
## What Happens During Cache Miss?

when CPU demanded content is not present in cache then it is said to be cache miss, so the demanded content is sent from main memory to cpu and along with it, the block (which contains missed content ) is copied from main memory to cache for future references. This reduces repeated expensive memory accesses.

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
   
hence, this Policies is used to implemented in real systems.

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



 

 

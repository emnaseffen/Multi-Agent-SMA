# Multi-Agent Supply and Demand Simulation

This project is a multi-agent simulation of supply and demand using the JADE (Java Agent DEvelopment) framework. It models the interactions between a **producer** and **multiple consumers**, each with individual purchasing behavior.

---

## 🧠 Project Description and Objective

The objective of this application is to simulate a market scenario where:

- A **Producer** sets a product price and broadcasts it.
- **N Consumers** each determine the quantity they wish to purchase at that price.

Each consumer calculates their demand based on a **linear demand function** and communicates the desired quantity to the producer. The producer then calculates its **profit** using the formula:


Where:
- `p`: unit price set by the producer
- `c`: unit production cost (assumed constant)
- `q`: total quantity sold

The **demand function** is defined as:


Where:
- `m = -Qmax / Pmax`
- `Qmax`: the maximum quantity the consumer would buy if the product were free (i.e., "greed")
- `Pmax`: the maximum price the consumer is willing to pay

---

## 🛠️ Methodology

### 1. Data Definition

- **Product**: defined by its name, unit production cost, and unit selling price.
- **Order**: includes the product and the quantity ordered.

### 2. Agents and Their Behaviors

#### 2.1. Agent Types

- **Producer Agent**:
  - Creates consumer agents.
  - Publishes the product's name and price to all consumers.
  - Receives orders from consumers and calculates total profit.
  - Comes with a graphical user interface (GUI).

- **Consumer Agents**:
  - Created by the producer.
  - Calculate the quantity to order using a demand planning function.
  - Send their order to the producer.
  - Do not have a GUI.

#### 2.2. Agent Behaviors

- **Product Publishing**:
  - Triggered via the producer's GUI.
  - Sends product information to all registered consumers.

- **Placing an Order**:
  - Triggered after a consumer receives product information.
  - Quantity is calculated using the consumer’s demand function.
  - The order is sent back to the producer.

- **Receiving an Order**:
  - Managed by the producer.
  - Updates the sales report including total quantity sold and profit.

---

## 📦 Technologies Used

- **Java**
- **JADE Framework** for agent-based simulation
- **Swing GUI** (for producer)

---

## 📁 Structure

- `ProducerAgent.java` – Manages product creation, GUI, and communication with consumers
- `ConsumerAgent.java` – Computes demand and places orders
- `Product.java` – Data model for products
- `Order.java` – Data model for orders

---

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/emnaseffen/Multi-Agent-SMA.git

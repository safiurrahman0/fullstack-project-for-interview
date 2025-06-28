import React, { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [products, setProducts] = useState([]);
  const [productName, setProductName] = useState("");

  useEffect(() => {
    axios.get("/products")
      .then((res) => setProducts(res.data))
      .catch((err) => console.error("Error loading products:", err));
  }, []);

  const handleCreateProduct = async (e) => {
    e.preventDefault();
    if (!productName.trim()) return;

    try {
      const res = await axios.post("/products", { name: productName });
      setProducts([...products, res.data]);
      setProductName("");
    } catch (err) {
      console.error("Error creating product:", err);
    }
  };

  return (
    <div style={{ padding: "2rem" }}>
      <h1>Product List</h1>
      <ul>
        {products.map(p => <li key={p.id}>{p.name}</li>)}
      </ul>
      <h2>Create Product</h2>
      <form onSubmit={handleCreateProduct}>
        <input
          type="text"
          value={productName}
          onChange={(e) => setProductName(e.target.value)}
          placeholder="Product name"
        />
        <button type="submit">Create</button>
      </form>
    </div>
  );
}

export default App;

import React, { useEffect, useState } from "react";

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("https://fullstackjava-production.up.railway.app/") // Java backend URL
      .then((response) => response.text())
      .then((data) => setMessage(data))
      .catch((error) => console.error("Fetch error:", error));
  }, []);

  return (
    <div>
      <h1>Fullstack Java App</h1>
      <p>{message}</p>
    </div>
  );
}

export default App;

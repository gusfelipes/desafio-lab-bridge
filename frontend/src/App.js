import React, { useState } from "react";

import api from "./services/api.js";

import "./global.css";
import "./App.css";
import "./Header.css";
import "./Main.css";

import RepoItem from "./components/RepoItem/index.js";

function App() {
  const [repos, setRepos] = useState([]);
  const [user, setUser] = useState([]);

  async function handleSearchRepos(e) {
    e.preventDefault();
    const response = await api.get(`/repos/${user}`);
    setRepos(response.data);
  }

  return (
    <div id="app">
      <header>
        <form onSubmit={handleSearchRepos}>
          <input
            type="text"
            name="user"
            id="user"
            required
            placeholder="Digite o nome do usuário"
            value={user}
            onChange={(e) => setUser(e.target.value)}
          />
          <button type="submit">Pesquisar</button>
        </form>
      </header>

      <main>
        <div className="repos-list">
          <ul>
            {repos.map((repo) => (
              <RepoItem key={repo.id} repo={repo} />
            ))}
          </ul>
        </div>
      </main>
    </div>
  );
}

export default App;

import React from "react";
import "./style.css";

function RepoItem({ repo }) {
  return (
    <li className="repo-item">
      <p>
        Nome:
        <strong>{repo.name}</strong>
      </p>
      <p>Autor: {repo.owner.login}</p>
      <p>Descrição: {repo.description}</p>
      <p>
        Estrelas: <strong>{repo.stargazers_count}</strong>
      </p>
    </li>
  );
}

export default RepoItem;

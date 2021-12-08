import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import api from "../../services/api";

function Repository() {
    const [repository, setRepository] = useState();
    const parametros = useParams();

    useEffect(() => {
        async function fetchData() {
            const response = await api.get(`/repos/${parametros.repository}`);
            setRepository(response.data);
        }

        fetchData();
    }, [])

    return (
        <>
            <header>
                <img src={repository?.owner.avatar_url} alt={repository?.owner.login} />
                <div>
                    <strong>{repository?.full_name}</strong>
                    <p>{repository?.description}</p>
                </div>
            </header>
            <ul>
                <li>
                    <strong>{repository?.stargazers_count}</strong>
                    <span>Stars</span>
                </li>
                <li>
                    <strong>{repository?.forks_count}</strong>
                    <span>Forks</span>
                </li>
                <li>
                    <strong>{repository?.open_issues_count}</strong>
                    <span>Open Issues</span>
                </li>
            </ul>
        </>
    )
}

export default Repository;
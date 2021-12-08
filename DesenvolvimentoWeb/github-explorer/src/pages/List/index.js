import { useState, useEffect } from "react";
import { FiChevronsRight } from "react-icons/fi"
import { Link } from "react-router-dom";
import api from "../../services/api";

import {
    Container,
    TitleContainer,
    Icon,
    Title,
    Input,
    RepositoryCard,
} from "./styles"

function List() {
    const [newRepo, setNewRepo] = useState("");
    const [repositories, setRepositories] = useState([]);

    useEffect(() => {
        console.log(repositories)
    }, [repositories])

    async function handleAddRepository(event) {
        event.preventDefault();

        try {
            const response = await api.get(`/repos/${newRepo}`);

            const repository = response.data;

            console.log(repository)

            setRepositories([...repositories, repository]);
        } catch (err) {
            console.log("Erro na busca deste repositório.", err.message)
        }
    }


    return (
        <Container>
            <TitleContainer>
                <Icon src="https://image.flaticon.com/icons/png/512/25/25231.png" />
                <Title>Github Explorer</Title>
            </TitleContainer>

            <form onSubmit={e => handleAddRepository(e)}>
                <Input placeholder="Digite o nome do repositório.." onChange={e => setNewRepo(e.target.value)} />
            </form>

            {
                repositories.map(repository => {
                    return (
                        <RepositoryCard key={repository.full_name}>
                            <Link to={`/repository/${repository.full_name}`}>
                                <img src={repository.owner.avatar_url} alt={repository.full_name} />
                                <div>
                                    <strong>{repository.full_name}</strong>
                                    <p>{repository.description}</p>
                                </div>

                                <FiChevronsRight size={20} />
                            </Link>
                        </RepositoryCard>
                    )
                })
            }
        </Container>
    )
}

export default List;
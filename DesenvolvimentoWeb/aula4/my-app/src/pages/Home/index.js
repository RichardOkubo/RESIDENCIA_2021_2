import { Link } from "react-router-dom";

import { Title } from "./styles";

function Home() {
    return (
        <>
            <Title>Home Page</Title>
            <Link to="/home/products">
                <button>Link to Products</button>

            </Link>
            <Link to="/">
                <button>Link to Login</button>
            </Link>
        </>
    )
}

export default Home;
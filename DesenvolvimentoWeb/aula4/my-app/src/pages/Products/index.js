import { Link } from "react-router-dom";

function Products() {
    return (
        <>
            <h1>Products Page</h1>
            <Link to="/home">
                <button>Link to Home</button>
            </Link>
            <Link to="/">
                <button>Link to Login</button>
            </Link>
        </>
    )
}

export default Products;
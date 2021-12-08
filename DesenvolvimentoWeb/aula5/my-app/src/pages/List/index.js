import { useState } from "react";
import { Link } from "react-router-dom";

function List() {
    const [products, setProducts] = useState([{
        id: 1,
        name: "Cadeira"
    },
    {
        id: 2,
        name: "Mesa"
    },
    {
        id: 3,
        name: "Porta"
    },
    {
        id: 4,
        name: "Geladeira"
    },
    {
        id: 5,
        name: "Mouse"
    },
    {
        id: 6,
        name: "Teclado"
    }])

    return (
        products.map(product => {
            return (
                <>
                    <Link to={`/home/products/${product.id}`}>
                        <h1>{product.name}</h1>
                    </Link>
                </>
            )
        })
    )
}

export default List;
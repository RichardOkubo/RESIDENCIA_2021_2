import { Link } from "react-router-dom";

import PrimaryButton from "../../components/PrimaryButton";

function Login() {
    return (
        <>
            <h1>Login Page</h1>
            <Link to="/home">
                <PrimaryButton message="Link to Home" />
            </Link>
            <Link to="/home/products">
                <PrimaryButton message="Link to Products" />
            </Link>
        </>
    )
}

export default Login;
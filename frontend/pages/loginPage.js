import styles from "../styles/Home.module.css";
import Head from "next/head";

export default function login() {
    return (
        <div className={styles.container}>
            <Head>
                <title>Test</title>
                <meta name="description" content="login"/>
            </Head>
            <main className={styles.main}>
                <h1 className={styles.title}>
                    Login
                </h1>
                <form action="/api/login" method="post">
                    <label htmlFor="login">Login:</label>
                    <input type="text" id="login" name="login"/>
                    <label htmlFor="password">Password:</label>
                    <input type="password" id="password" name="password"/>
                    <button type="submit" formMethod="post">Submit</button>
                </form>
            </main>
        </div>
    )
}
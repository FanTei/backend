import styles from "../styles/Home.module.css";
import Head from "next/head";

export default function registration() {
    return (
        <div className={styles.container}>
            <Head>
                <title>Test</title>
                <meta name="description" content="registration"/>
            </Head>
            <main className={styles.main}>
                <h1 className={styles.title}>
                    Registration
                </h1>
                <form action="/api/registration" method="post">
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
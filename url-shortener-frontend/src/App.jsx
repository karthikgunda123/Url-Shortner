import './App.css'
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import LandingPage from "./components/LandingPage.jsx";
import AboutPage from "./components/AboutPage.jsx";
import Navbar from "./components/Navbar.jsx";
import Footer from "./components/Footer.jsx";
import RegisterPage from "./components/RegisterPage.jsx";
import {Toaster} from "react-hot-toast";

function App() {
  return (
      <>
          <Router>
              <Navbar/>
              <Toaster position="bottom-center" />
              <Routes>
                  <Route path="/" element={<LandingPage/>}/>
                  <Route path="/about" element={<AboutPage/>}/>
                  <Route path="/register" element={<RegisterPage/>}/>
              </Routes>
              <Footer/>
          </Router>
      </>
  )
}

export default App

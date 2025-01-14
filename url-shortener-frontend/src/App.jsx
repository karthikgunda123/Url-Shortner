import './App.css'
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import LandingPage from "./components/LandingPage.jsx";
import AboutPage from "./components/AboutPage.jsx";
import Navbar from "./components/Navbar.jsx";
import Footer from "./components/Footer.jsx";

function App() {
  return (
      <>
          <Router>
              <Navbar/>
              <Routes>
                  <Route path="/" element={<LandingPage/>}/>
                  <Route path="/about" element={<AboutPage/>}/>
              </Routes>
              <Footer/>
          </Router>
      </>
  )
}

export default App

import React, { Component } from "react";


class Square extends Component {
    render() {
        return (
            <button className="square" 
            onClick={ () => {
                console.log('Click');
                this.props.onClick()
                }
            }> 
                { this.props.value } 
            </button>
        );
    }
}

export default Square;